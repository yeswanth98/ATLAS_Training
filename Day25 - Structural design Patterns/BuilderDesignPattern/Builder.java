package BuilderDesignPattern;

interface Builder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    Computer getResult();
}