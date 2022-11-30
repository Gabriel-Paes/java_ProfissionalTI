import java.util.ArrayList;

public class ListaDeItens {
    public ArrayList<ItemSistema> lista = new ArrayList<ItemSistema>();
    public ItemSistema item = new ItemSistema();
    public Double valorLista;

    public ListaDeItens() {
        valorLista = item.getValor();   
    }

    public void addItemDeSistema(ItemSistema NovoItem) {
        lista.add(NovoItem);
        valorLista = valorLista + NovoItem.getValor();
    }

    public void exibirLista() {
        for (ItemSistema is : lista){
            System.out.println("\nItem de Sistema: "+ is.getNome());
            System.out.println("Complexidade do Item de Sistema: "+ is.getComplexidade());
            System.out.println("Esforço do Item de Sistema: " + is.CalculaEsforcoHoras() + " Horas");
            System.out.println("Valor total do sistema: " + is.getValor());
        }
    }

    public ArrayList<ItemSistema> getLista() {
        return lista;
    }

    public void setLista(ArrayList<ItemSistema> lista) {
        this.lista = lista;
    }

    public ItemSistema getItem() {
        return item;
    }

    public void setItem(ItemSistema item) {
        this.item = item;
    }

    public Double getValorLista() {
        return valorLista;
    }

    public void setValorLista(Double valorLista) {
        this.valorLista = valorLista;
    }
    
}