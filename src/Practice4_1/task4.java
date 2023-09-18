package Practice4_1;

class Matrix{
    double[][] mass;
    int columns_number;
    int rows_number;

    public Matrix(double[][] mass, int columns_number, int rows_number) {
        this.mass = mass;
        this.columns_number = columns_number;
        this.rows_number = rows_number;
    }

    public double[][] getMass() {
        return mass;
    }

    public void setMass(double[][] mass) {
        this.mass = mass;
    }

    public int getColumns_number() {
        return columns_number;
    }

    public void setColumns_number(int columns_number) {
        this.columns_number = columns_number;
    }

    public int getRows_number() {
        return rows_number;
    }

    public void setRows_number(int rows_number) {
        this.rows_number = rows_number;
    }

    public void add(Matrix matrix){
        if (matrix.getColumns_number()!=this.columns_number || matrix.getRows_number()!=this.rows_number){
            System.out.println("Разные размерности матриц");
        }
        else{
            for (int i=0; i<this.rows_number; i++){
                for (int j=0; j<this.columns_number; j++){
                    mass[i][j] = mass[i][j]+matrix.getMass()[i][j];
                }
            }
        }
    }
    public void prod(double n){
        for (int i=0; i<this.rows_number; i++){
            for (int j=0; j<this.columns_number; j++){
                mass[i][j] = mass[i][j]*n;
            }
        }

    }

    public Matrix prod(Matrix matrix){
        double[][] mass2 = new double[this.rows_number][matrix.getColumns_number()] ;
        if (this.columns_number!=matrix.getRows_number()){
            System.out.println("Неподходящие размерности матриц");
            return null;
        }
        else{
            for (int i=0; i<this.rows_number; i++){
                    for (int k=0; k<matrix.getColumns_number(); k++){
//                        mass2[i][k] = 0;
                        for (int j=0; j<this.columns_number; j++){
                            mass2[i][k] = mass2[i][k]+mass[i][j]*matrix.getMass()[j][k];
                        }
                    }
            }
            System.out.println("All is ok");
            return new Matrix(mass2, matrix.getColumns_number(), this.rows_number);
        }


    }

    public void print(){
        System.out.println("Матрица:");
        for (int i=0; i<this.rows_number; i++){
            for (int j=0; j<this.columns_number; j++){
                System.out.printf("%8.2f", mass[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] mat1 = {{1,2,3}, {4,5,6}};
        double[][] mat2 = {{1,2, 5,7}, {4,5,8, 9}, {1,1,1,1}};
        Matrix matrix1 = new Matrix(mat1, 3, 2);
        Matrix matrix2 = new Matrix(mat2, 4, 3);
        matrix1.print();
        matrix2.print();
        matrix1.prod(2);
        matrix1.print();
        matrix1.add(matrix1);
        matrix1.print();
        matrix1.prod(matrix2).print();
    }
}