import java.util.LinkedHashMap;
import java.util.Map;

public class ConfigurationManager {
    // A única instância da classe (Singleton Eager)
    private static final ConfigurationManager instance = new ConfigurationManager();

    // LinkedHashMap mantém a ordem de inserção (importante para a saída igual ao enunciado)
    private Map<String, String> properties = new LinkedHashMap<>();

    // Conteúdo simulado do arquivo
    private static final String CONFIG_CONTENT = 
        "AppId=1649240\n" +
        "UserName=elamigos\n" +
        "Language=brazilian\n" +
        "Offline=0\n" +
        "AutoDLC=0\n" +
        "BuildId=10547147\n" +
        "DLCName=Returnal Pre-Purchase Entitlement\n" +
        "UpdateDB=1\n" +
        "Signature=FitGirl\n" +
        "WindowInfo=LAAAAAAAAAAIP50AAACIAAAATQMAAJACAAA=\n" +
        "LVWindowInfo=AwAAADEBAAByAAAApQAAAA==\n" +
        "ApplicationPath=../../../Returnal.exe\n" +
        "WorkingDirectory=\n" +
        "WaitForExit=1\n" +
        "NoOperation=0";

    // Construtor privado: Bloqueia o operador 'new' para outras classes
    private ConfigurationManager() {
        loadConfiguration();
    }

    // Ponto global de acesso à instância
    public static ConfigurationManager getInstance() {
        return instance;
    }

    private void loadConfiguration() {
        String[] lines = CONFIG_CONTENT.split("\n");
        for (String line : lines) {
            if (line.contains("=")) {
                int splitIndex = line.indexOf("=");
                String key = line.substring(0, splitIndex).trim();
                String value = line.substring(splitIndex + 1).trim();
                properties.put(key, value);
            }
        }
    }
}