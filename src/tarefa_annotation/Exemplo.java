package tarefa_annotation;

class Exemplo {
    @Tabela(value = "tabela_exemplo")
    private String nomeDoCampo;

    
    public String getNomeDaTabela() {
        try {
            Tabela anotacao = Exemplo.class.getDeclaredField("nomeDoCampo").getAnnotation(Tabela.class);
            if (anotacao != null) {
                return anotacao.value();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo();
        String nomeDaTabela = exemplo.getNomeDaTabela();
        System.out.println("Nome tabela: " + nomeDaTabela);
    }
}