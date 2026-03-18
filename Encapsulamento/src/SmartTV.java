public class SmartTV {
    private String marca, modelo;
    private int volume;
    private boolean internet;

    public SmartTV(String marca, String modelo, int volume, boolean internet) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
        this.internet = internet;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
        else System.out.println("Volume invalido");
    }
    public int getVolume() {
        return this.volume;
    }
    public void setMarca(String marca) {
        if (marca.length()  < 30){
            this.marca = marca;
        }
        else System.out.println("Marca invalido");
    }
    public String getMarca() {
        return this.marca;
    }
    public void setModelo(String modelo) {
        char lertraInicial = modelo.charAt(0);
        boolean resp = Character.isUpperCase(lertraInicial);
        if (resp) {
            this.modelo = modelo;
        }
        else System.out.println("Modelo invalido");
    }
    public String getModelo() {
        return this.modelo;
    }
    public void aumentaVolume(int x) {
        this.setVolume(this.volume + x);
    }
    public void diminuiVolume(int x) {
        this.setVolume(this.volume - x);
    }
    public void abrirYoutube(){
        if (this.conectaInternet()){
            System.out.println("Youtube conectado");
        }
        else {
            System.out.println("Sem internet");
        }
    }


    private boolean conectaInternet(){
        System.out.println("Verificando conexões dispoíveis");
        System.out.println("Consultando as credenciais");
        int randomico = (int) (Math.random() * 10);
        if (randomico < 50){
            System.out.println("IP conectado com sucesso");
            return true;
        }
        else{
            System.out.println("Falha na conexão");
            return false;
        }
    }
}
