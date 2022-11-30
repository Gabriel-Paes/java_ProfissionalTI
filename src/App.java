public class App {
    public static void main(String[] args) throws Exception {
        Profissional profissional = new Profissional();
        ListaDeItens lista = new ListaDeItens();

        profissional.Nome = "Gabriel";
        profissional.SalarioMensalDesejado = 3000;

        // Login
        // Dados Demográficos (sexo, idade, estado)
        // Formulário (quarto seleções finalistas)
        // Relatório (os mais votados, por faixa etária, sexo e estado)
        // Flutter (Android/Publicado na loja Google)

        // Login (24h BancoDados, 24h BackEnd, 48h FrontEnd) = 96 Horas (Médio/Complexo)
        // Dados Demográficos (gênero(masculino, feminino, prefiro não opinar), idade,
        // estado) = 72 Horas
        // Formulário (quarto seleções finalistas) = 72 Horas
        // Relatório (os mais votados, por faixa etária, sexo e estado) = 24 Horas
        // 1 .. 4 (1 = 24, 2 = 48, 3 = 72, 4 = 96)

        System.out.println("Nome do profissional: " + profissional.Nome);
        System.out.println("Salário Desejado: " + profissional.SalarioMensalDesejado);
        System.out.println("Quantidade de Horas no mês: " + profissional.CalculaHorasMensais());
        System.out.println("Valor Hora:  " + profissional.CalculaValorHora());

        ItemSistema itemLogin = new ItemSistema();
        itemLogin.nome = "Tela de Login";
        itemLogin.complexidade = 4;
        itemLogin.valor = profissional.CalculaValorHora() * itemLogin.CalculaEsforcoHoras();
        lista.addItemDeSistema(itemLogin);

        ItemSistema itemDados = new ItemSistema("Tela de Dados Demográficos", 3, 0.0);
        itemDados.valor = profissional.CalculaValorHora() * itemDados.CalculaEsforcoHoras();
        lista.addItemDeSistema(itemDados);

        ItemSistema itemFormulario = new ItemSistema("Tela de Formulário", 3, 0.0);
        itemFormulario.valor = profissional.CalculaValorHora() * itemFormulario.CalculaEsforcoHoras();
        lista.addItemDeSistema(itemFormulario);

        ItemSistema itemRelatorio = new ItemSistema("Tela de Relatório", 1, 0.0);
        itemRelatorio.valor = profissional.CalculaValorHora() * itemRelatorio.CalculaEsforcoHoras();
        lista.addItemDeSistema(itemRelatorio);

        lista.exibirLista();

        System.out.println("\nValor da Total da lista de Itens: " + lista.getValorLista());
    }
}
