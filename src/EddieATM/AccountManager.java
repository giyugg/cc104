package EddieATM;

import java.io.*;
import java.util.*;

public class AccountManager {
    private static final String FILE = "accounts.json";
    private Map<String, ATMAccount> accounts = new HashMap<>();

    public AccountManager() {
        loadAccounts();
    }

    public void loadAccounts() {
        accounts.clear();
        File file = new File(FILE);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) sb.append(line);

            String json = sb.toString().trim();
            if (json.isEmpty()) return;

            json = json.substring(1, json.length() - 1);
            String[] entries = json.split("},");
            for (String entry : entries) {
                if (!entry.endsWith("}")) entry += "}";
                String[] parts = entry.split(":", 2);
                String accName = parts[0].trim().replaceAll("\"", "");
                String accJson = parts[1].trim();

                String pin = accJson.split("\"pin\"\\s*:\\s*\"")[1].split("\"")[0];
                double balance = Double.parseDouble(accJson.split("\"balance\"\\s*:\\s*")[1].replaceAll("[^0-9.]", ""));

                accounts.put(accName, new ATMAccount(accName, pin, balance));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveAccounts() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE))) {
            bw.write("{");
            boolean first = true;
            for (Map.Entry<String, ATMAccount> entry : accounts.entrySet()) {
                if (!first) bw.write(",");
                first = false;

                ATMAccount acc = entry.getValue();
                bw.write("\"" + acc.getAcc() + "\":{");
                bw.write("\"pin\":\"" + acc.getPin() + "\",");
                bw.write("\"balance\":" + acc.getBalance());
                bw.write("}");
            }
            bw.write("}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean createAccount(String acc, String pin, double balance) {
        if (accounts.containsKey(acc)) return false;
        accounts.put(acc, new ATMAccount(acc, pin, balance));
        saveAccounts();
        return true;
    }

    public boolean deleteAccount(String acc) {
        if (!accounts.containsKey(acc)) return false;
        accounts.remove(acc);
        saveAccounts();
        return true;
    }

    public ATMAccount getAccount(String acc) {
        return accounts.get(acc);
    }

    public boolean verifyPin(String acc, String pin) {
        ATMAccount account = accounts.get(acc);
        return account != null && account.getPin().equals(pin);
    }
}
