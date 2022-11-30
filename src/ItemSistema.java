public class ItemSistema {
    public String nome;
    public int complexidade;
    public Double valor;

    public ItemSistema() {
        nome = "";
        complexidade = 0;
        valor = 0.0;
    }

    public ItemSistema(String nome, int complexidade, Double valor) {
        this.nome = nome;
        this.complexidade = complexidade;
        this.valor = valor;
    }

    public int CalculaEsforcoHoras() {
        // 1 .. 4 (1 = 24, 2 = 48, 3 = 72, 4 = 96)
        switch (complexidade) {
            case 1: return 24;
            case 2: return 48;
            case 3: return 72;
            case 4: return 96;
            default: return -1;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(int complexidade) {
        this.complexidade = complexidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}
