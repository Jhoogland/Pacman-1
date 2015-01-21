package com.company;

public class LevelHandler{

    //2D Array that holds the structure
    // 0 = Nothing ( Pathway )
    // 1 = Walls
    // 2 = Pacman
    // 3 = DrunkGhost1
    // 4 = DrunkGhost2
    // 5 = SmartGhost1
    // 6 = SmartGhost2
    // 7 = Fruit
    // 8 = SuperFruit

    private int gridStructureLvl1[][] = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 2, 7, 7, 7, 7, 7, 7, 7, 7, 1, 8, 7, 7, 7, 7, 7, 7, 8, 1},
            {1, 7, 1, 1, 1, 7, 1, 1, 1, 7, 1, 7, 1, 1, 7, 1, 1, 1, 7, 1},
            {1, 7, 1, 1, 1, 7, 1, 1, 1, 7, 1, 7, 1, 1, 7, 1, 1, 1, 7, 1},
            {1, 7, 1, 1, 1, 7, 1, 1, 1, 7, 1, 7, 1, 1, 7, 1, 1, 1, 7, 1},
            {1, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 1},
            {1, 7, 1, 1, 1, 7, 1, 1, 7, 1, 7, 1, 7, 1, 7, 1, 1, 1, 7, 1},
            {1, 7, 1, 1, 1, 7, 1, 1, 7, 1, 7, 1, 7, 1, 7, 1, 1, 1, 7, 1},
            {1, 8, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 5, 1, 7, 3, 4, 8, 6, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    };

    private int gridStructureLvl2[][] = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 2, 1, 1, 1, 1, 7, 7, 7, 7, 1, 8, 7, 7, 7, 7, 7, 7, 8, 1},
            {1, 7, 1, 1, 1, 7, 1, 1, 1, 7, 1, 7, 1, 1, 7, 1, 1, 1, 7, 1},
            {1, 7, 1, 1, 1, 7, 1, 1, 1, 7, 1, 7, 1, 1, 7, 1, 1, 1, 7, 1},
            {1, 7, 1, 1, 1, 7, 1, 1, 1, 7, 1, 7, 1, 1, 7, 1, 1, 1, 7, 1},
            {1, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 1},
            {1, 7, 1, 1, 1, 7, 1, 1, 7, 1, 7, 1, 7, 1, 7, 1, 1, 1, 7, 1},
            {1, 7, 1, 1, 1, 7, 1, 1, 7, 1, 7, 1, 7, 1, 7, 1, 1, 1, 7, 1},
            {1, 8, 7, 7, 7, 7, 1, 1, 7, 7, 8, 7, 7, 1, 7, 3, 4, 5, 6, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    };

    private int gridStructureLvl3[][] = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 2, 7, 7, 7, 1, 7, 7, 7, 7, 1, 8, 7, 7, 7, 7, 7, 7, 8, 1},
            {1, 7, 1, 1, 1, 1, 1, 1, 1, 7, 1, 7, 1, 1, 7, 1, 1, 1, 7, 1},
            {1, 7, 1, 1, 1, 1, 1, 1, 1, 7, 1, 7, 1, 1, 7, 1, 1, 1, 7, 1},
            {1, 7, 1, 1, 1, 1, 1, 1, 1, 7, 1, 7, 1, 1, 7, 1, 1, 1, 7, 1},
            {1, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 1},
            {1, 7, 1, 1, 1, 7, 1, 1, 7, 1, 7, 1, 7, 1, 7, 1, 1, 1, 7, 1},
            {1, 7, 1, 1, 1, 7, 1, 1, 7, 1, 7, 1, 7, 1, 7, 1, 1, 1, 7, 1},
            {1, 8, 7, 7, 7, 7, 1, 1, 7, 7, 8, 7, 7, 1, 7, 3, 4, 5, 6, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    };

    private int gridStructure[][];
    private int currentLvl = 0;
    private boolean allLvlsCleared = false;

   public int[][] getGridStructure(int lvl)
   {
       int gridStructure[][] = null;

       if(lvl == 1)
       {
           gridStructure = this.gridStructureLvl1;
       }
       else if(lvl == 2)
       {
           gridStructure = this.gridStructureLvl2;
       }
       else if(lvl == 3)
       {
           gridStructure = this.gridStructureLvl3;
       }
       else
       {
           gridStructure = this.gridStructure;
       }

       return gridStructure;
   }

    public void setGridStructure(int[][] gridStructure)
    {
        this.gridStructure = gridStructure;
    }

    public int getCurrentLvl()
    {
        return this.currentLvl;
    }

    public void setCurrentLvl(int lvl)
    {
        this.currentLvl = lvl;
    }

    public void setAllLvlsCleared(boolean cleared)
    {
        this.allLvlsCleared = cleared;
    }

    public boolean getAllLvlsCleared()
    {
        return this.allLvlsCleared;
    }

}