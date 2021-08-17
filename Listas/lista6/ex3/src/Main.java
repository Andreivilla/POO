public class Main {
    public static void main(String[] args) {
        // 5 clientes
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        Cliente cliente4 = new Cliente();
        Cliente cliente5 = new Cliente();

        //3 servidores
        Servidor servidor1 = new Servidor();
        servidor1.setIp("243.28.633.62");
        Servidor servidor2 = new Servidor();
        servidor1.setIp("896.75.622.49");
        Servidor servidor3 = new Servidor();
        servidor1.setIp("979.99.368.34");

        //3 mensagens
        String mensagem1 = "404";
        String mensagem2 = "500 internal server error";
        String mensagem3 = "Servico ocupado";

        servidor1.adicionoar(cliente1);
        servidor1.adicionoar(cliente2);
        servidor1.adicionoar(cliente3);
        servidor3.adicionoar(cliente1);
        servidor3.adicionoar(cliente2);
        servidor3.adicionoar(cliente3);
        servidor2.adicionoar(cliente4);
        servidor2.adicionoar(cliente5);
        servidor1.adicionoar(cliente4);
        servidor3.adicionoar(cliente5);

        servidor1.enviarMensagem(mensagem1);
        servidor2.enviarMensagem(mensagem2);
        servidor3.enviarMensagem(mensagem3);

        System.out.println("Mensagens cliente 1: ");
        System.out.println(cliente1.toString());
        System.out.println("Mensagens cliente 2: ");
        System.out.println(cliente2.toString());
        System.out.println("Mensagens cliente 3: ");
        System.out.println(cliente3.toString());
        System.out.println("Mensagens cliente 4: ");
        System.out.println(cliente4.toString());
        System.out.println("Mensagens cliente 5: ");
        System.out.println(cliente5.toString());


    }
}
