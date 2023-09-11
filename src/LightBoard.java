public class LightBoard {

    private boolean[][] lights;

    public LightBoard(int numRows, int numCols) {
        this.lights = new boolean[numRows][numCols];
        for(int i = 0; i<numRows; i++){
            for(int j = 0; j<numCols; j++){
                double percent = Math.random();
                if(percent<=0.4){
                    lights[i][j] = true;
                }

                lights[i][j] = false;


            }
        }

    }

    public boolean evaluateLight(int row, int col) {
        int numOn = 0;
        if(!lights[row][col]){
            for(int i = 0; i<lights.length; i++){
                if(lights[i][col]){
                    numOn++;
                }
            }
            if(numOn%2==0){
                return false;
            }

        }
        else if(lights[row][col]){
            for(int i = 0; i<lights.length; i++){
                if(lights[i][col]){
                    numOn++;
                }
            }
            if(numOn%3==0){
                return true;
            }


        }

        return lights[row][col];


    }

    public boolean[][] getLights(){
        return lights;
    }

    public void setLights(boolean[][] lights) {
        this.lights = lights;
    }
}