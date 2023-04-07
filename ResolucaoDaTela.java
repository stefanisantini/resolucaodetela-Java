public class ResolucaoDaTela {    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        System.out.println("Sua resolução de tela é:");
        System.out.println(resolucao.getScreenSize());
    }

}
