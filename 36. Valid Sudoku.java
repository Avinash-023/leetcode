class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0;row<9;row++){
            HashSet<Character> rw=new HashSet<>();
            for(int col=0;col<9;col++){
                char ele=board[row][col];
                if(ele!='.'){
                    if(rw.contains(ele)){
                        return false;
                    }
                    rw.add(ele);
                }
            }
        }

        for(int col=0;col<9;col++){
            HashSet<Character> cm=new HashSet<>();
            for(int row=0;row<9;row++){
                char ele=board[row][col];
                if(ele!='.'){
                    if(cm.contains(ele)){
                        return false;
                    }
                cm.add(ele);
                }
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                HashSet<Character> set=new HashSet<>();
                int srow=i*3;
                int scol=j*3;
                for(int row=srow;row<srow+3;row++){
                    for(int col=scol;col<scol+3;col++){
                        char ele=board[row][col];
                        if(ele!='.'){
                            if(set.contains(ele)){
                                return false;
                            }
                            set.add(ele);
                        }
                    }
                }
            }
        }
        return true;
    }
}
