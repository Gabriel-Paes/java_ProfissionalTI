public class Profissional {
    public String Nome;
    public double SalarioMensalDesejado;
    public double FHD = 7;
    public double diasUteisMensaisPadrao = 20;

    //Salário CLT
    //1 mês de férias + 1/3 abono de férias
    //FGTS = 8,33%
    //13º Salário => 52 => 13 equivale a semana faltante
    //INSS -> 8%, 12%
    //VR -> 25,00 cct

    public double CalculaHorasMensais() {
        return (FHD * diasUteisMensaisPadrao);
    }

    public double CalculaValorHora() {
        return (SalarioMensalDesejado * 2) / CalculaHorasMensais();
    }
}
