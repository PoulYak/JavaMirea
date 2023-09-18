package Practice4;

class Computer{
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Processor processor, Memory memory, Monitor monitor) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}

class Processor{
    int kernels;
    double freq;

    public Processor(int kernels, double freq) {
        this.kernels = kernels;
        this.freq = freq;
    }

    public int getKernels() {
        return kernels;
    }

    public void setKernels(int kernels) {
        this.kernels = kernels;
    }

    public double getFreq() {
        return freq;
    }

    public void setFreq(double freq) {
        this.freq = freq;
    }
}
class Memory{
    int size;

    public Memory(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

class Monitor{
    double diagonal;
    String brand;

    public Monitor(double diagonal, String brand) {
        this.diagonal = diagonal;
        this.brand = brand;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}