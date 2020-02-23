//Q9.  Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables.
// There are stress and fire tests for each products.

package com.company;

interface Test{
    void stressTest(int stressValue);
    void fireTest(boolean ifsFlammable);
}

class Furniture implements Test{
    String material;

    Furniture(String material){
        this.material = material;
    }

    @Override
    public void stressTest(int stressValue) { }

    @Override
    public void fireTest(boolean ifsFlammable) { }
}

class Table extends Furniture{
    String type;
    int height;
    int width;
    public Table(String material, int h, int w) {
        super(material);
        this.height = h;
        this.width = w;
    }

}

class Chair extends Furniture{
    String type;
    int height;
    int width;
    Chair(String material, int h, int w) {
        super(material);
        this.height = h;
        this.width = w;
    }
}

public class Question9 {
    public static void main(String[] args) {
        Table metalTable = new Table("Metal", 10, 10);
        Table woodenTable = new Table("Wooden", 15, 15);

        Chair metalChair = new Chair("Metal", 10,10);
        Chair woddenChair = new Chair("Wooden", 5, 5);

    }
}
