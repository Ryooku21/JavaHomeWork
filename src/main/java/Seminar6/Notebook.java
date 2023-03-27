package Seminar6;

public class Notebook {
    public String brand;
    public int ram;
    public int hdd;
    public String gpu;
    public String cpu;

    public Notebook(String _brand, int _ram, int _hdd, String _gpu, String _cpu){
        setValues(_brand, _ram, _hdd, _gpu, _cpu);
    }

    public void setValues(String _brand, int _ram, int _hdd, String _gpu, String _cpu){
        brand = _brand;
        ram = _ram;
        hdd = _hdd;
        gpu = _gpu;
        cpu = _cpu;
    }

    public String getValues(){
        return "Notebook:" + brand + ", RAM:" + ram + ", HDD:" + hdd + ", GPU:" + gpu + ", CPU:" + cpu;
    }

}
