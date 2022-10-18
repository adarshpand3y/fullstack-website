package Strings;

public class Count2DCharArray {
	
	 public int findOccurrence(char mat[][], String target)
	    {
	        int res = 0;
	        
	        for(int i = 0 ; i < mat.length ; i++)
	        {
	            for(int j = 0 ; j < mat[0].length ; j++)
	            {
	                res += helper(mat , i , j , target , 0);
	            }
	        }
	        
	        return res;
	    }
	    
	    int helper(char mat[][] , int i , int j , String target , int idx){
	        
	        int found = 0 ; 
	        
	        if(i < mat.length && i >= 0 && j < mat[0].length && j>=0 &&
	                    target.charAt(idx) == mat[i][j])
	        {
	            mat[i][j] = '#';
	            if(idx == target.length()-1)
	            {
	                found = 1;
	            }
	            
	            else
	            {
	                found += helper(mat , i , j-1 , target , idx+1);
	                found += helper(mat , i+1 , j , target , idx+1);
	                found += helper(mat , i-1 , j , target , idx+1);
	                found += helper(mat , i , j+1 , target , idx+1);
	            }
	            
	            mat[i][j] =  target.charAt(idx);
	        }
	        
	        return found;
	    }

	public static void main(String[] args) {
		
		//ye likhna hai bro

		//better version
//		bool search(int i , int j , int n , int m , vector<vector<char>> &board , string &word , int k)
//		{
//		    if(k == word.size() )
//		       return true ;
//		    
//		    if(i < 0 || j < 0 || i == n || j == m  || board[i][j] != word[k])
//		        return false ;
//		    
//		    char ch = board[i][j] ;
//		    board[i][j] = '#' ; 
//		    bool op1 = search(i + 1 , j , n , m , board , word , k + 1) ; 
//		    bool op2 = search(i , j + 1 , n , m , board , word , k + 1) ;
//		    bool op3 = search(i - 1 , j , n , m , board , word , k + 1) ;
//		    bool op4 = search(i , j - 1 , n , m , board , word , k + 1) ;
//		    
//		    board[i][j] = ch ;
//
//		    return op1 || op2 || op3 || op4 ;
//		}
//
//		public:
//		    bool exist(vector<vector<char>>& board, string &word) {
//		        
//		    int n = board.size() ;
//		    int m = board[0].size() ;
//		        
//		        
//		    for(int i = 0 ; i < n ; i++)
//		    {
//		        for(int j = 0 ; j < m ; j++)
//		        { 
//		            if(board[i][j] == word[0] )
//		            { 
//		                if(search(i , j , n , m , board , word , 0) )
//		                    return true ;
//		            }
//		        }
//		    }
//
//		    return false ; 
//		}
//		};
		
	}

}
