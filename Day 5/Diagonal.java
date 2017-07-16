class Diagonal{
    public static void main(String[] args) {
        
        int [][]mat = { {1,2,3},
                {4,5,6},
                {7,8,9},
};
                  
int N=3;
                  
for (int s=0; s<N; s++) {
    for (int i=s; i>-1; i--) {
        System.out.print(mat[i][s-i] + " ");
    }
    System.out.println();
}
        
for (int s=1; s<N; s++) {
    for (int i=N-1; i>=s; i--) {
        System.out.print(mat[i][s+N-1-i] + " ");
    }
    System.out.println();
}
    }
}
