public class Main {
    public static void main(String[] args) {
        // O cliente não dá 'new'. Ele pede a instância ao Singleton.
        ConfigurationManager config = ConfigurationManager.getInstance();
        
        // Executa a tarefa principal
        config.printAllProperties();
    }
}