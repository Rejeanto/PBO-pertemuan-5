package com.pboreg;

class Class {
    private int a = 10;//atribute ini  boleh diakses secara langsung dr luar classku
    private int b = 20;//atribute ini boleh diakses secara langsung dr luar classku
    private int c = 30;//attribute ini tidak bisa di akses

    public int tampilkana()
    {
        return this.a;
    }
    public int tampilkanb()
    {
        return this.b;
    }
    public int tampilkanc()
    {
        return this.c;
    }
    public void inputa(int nilai)
    {
        this.a = nilai;
    }
    public void inputb(int nilai)
    {
        this.b = nilai;
    }
    public void inputc(int nilai)
    {
        this.c = nilai;
    }
    public int tambah()
    {
        int hasil = this.a + this.b + this.c;
        return hasil;
    }
    public int kurang()
    {
        int hasil = this.a - this.b - this.c;
        return hasil;
    }
    public int kali()
    {
        int hasil = this.a * this.b * this.c;
        return hasil;
    }
    public double bagi()
    {
        double hasil = (double)this.a / (double)this.b;
        return hasil;
    }
}
