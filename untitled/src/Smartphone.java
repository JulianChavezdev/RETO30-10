public class Smartphone {
    private String marca;
    private String modelo;
    private double tamanyoPantalla;
    private int capacidadBateria;
    private Boolean encendido;
    private int nivelBateria;
    private String sistemaOperativo;

    public Smartphone(String marca, String modelo, int capacidadBateria, double tamanyoPantalla, Boolean encendido, int nivelBateria, String sistemaOperativo) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadBateria = capacidadBateria;
        this.tamanyoPantalla = tamanyoPantalla;
        this.encendido = encendido;
        this.nivelBateria = nivelBateria;
        this.sistemaOperativo = sistemaOperativo;
    }

    public Smartphone() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTamanyoPantalla() {
        return tamanyoPantalla;
    }

    public void setTamanyoPantalla(double tamanyoPantalla) {
        this.tamanyoPantalla = tamanyoPantalla;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public Boolean getEncendido() {
        return encendido;
    }

    public void setEncendido(Boolean encendido) {
        this.encendido = encendido;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public boolean encender(){
        return encendido = true;
    }

    public boolean apagar(){
        return encendido = false;
    }
    //Este  metodo nos resta 5 cada x minutos de uso.
    public int usar(int minutos){
        int uso = Math.max(0, minutos);
        int diminicionBateria = uso / 5;
        return this.nivelBateria = Math.max(0,this.nivelBateria - diminicionBateria);
        // Este metodo funciona para que sume 2 cada x minutos de cargar.
    }
    public int cargar(int minutos){
        int carga = Math.max(0, minutos);
        int cargaBateria = carga / 2;
        return this.nivelBateria = Math.min(100,this.nivelBateria + cargaBateria);
    }
// Aqui ponemos el toString
    @Override
    public String toString() {
        return this.marca + " " + this.modelo + " - Encendido: " + this.encendido + ", batería restante: " + this.nivelBateria + "%";
    }
}

