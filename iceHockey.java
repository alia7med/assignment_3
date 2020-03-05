package Classes;

import java.awt.Point;

import eg.edu.alexu.csd.datastructure.iceHockey.IPlayersFinder;

public class iceHockey implements IPlayersFinder {
	
	private int noOfOcc = 0 ;
	private int maxR,minR,maxC,minC,index=0 ;
	private	Point[] temp = new Point[1000] ; //An assumption that points doesn't exceed 1000.
	
	public void sort(Point[] temp)
	{
		for(int i = 0;i<index;i++)
		{
			for(int j = i+1;j<index;j++)
			{
				if(temp[i].x>temp[j].x)
				{
					Point large = new Point(temp[i]),small=new Point(temp[j]);
					temp[i]=new Point(small);
					temp[j]=new Point(large);
				}
			}
		}	
				
		for(int i = 0 ;i<index-1;i++)
		{
			 if(temp[i].x==temp[i+1].x)
			{
				if(temp[i].y>temp[i+1].y)
				{
					Point large = new Point(temp[i]),small=new Point(temp[i+1]);
					temp[i]=new Point(small);
					temp[i+1]=new Point(large);
				}
		   }
		}
		
	}
	
	
	
	public void getCenter(int minArea)
	{
		if(noOfOcc>=minArea)
		{
			temp[index++].move(maxC+minC+1,  maxR+minR+1); 
		}
	}
	public void getMax(int x , int y )
	{
		if(x<minR)
			minR=x;
		if(x>maxR)
			maxR=x;
		if(y<minC)
			minC=y;
		if(y>maxC)
			maxC=y;
	}
	
	public void getChain (char arr[][],int team,int i,int j)
	{
		if( j+1<arr[0].length && arr[i][j+1]-'0'==team)
		{
			arr[i][j+1]='y';
			noOfOcc++;
			getMax(i,j+1);
			getChain ( arr, team, i, j+1);
		}
		if(j-1>=0 &&arr[i][j-1]-'0'==team)
		{
			arr[i][j-1]='y';
			noOfOcc++;
			getMax( i ,  j-1 );
			getChain ( arr, team, i, j-1);
		}
		if(i+1<arr.length &&arr[i+1][j]-'0'==team)
		{
			arr[i+1][j]='y';
			noOfOcc++;
			getMax( i+1,j);
			getChain ( arr, team, i+1, j);
		}
		if(i-1>=0&& arr[i-1][j]-'0'==team)
		{
			arr[i-1][j]='y';
			noOfOcc++;
			getMax(i-1,j);
			getChain ( arr, team, i-1, j);
		}
	}
	
	public void getOcc(char [][]arr,int team,int minArea)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]-'0'==team)
				{
					noOfOcc++;
					arr[i][j]='y';
					maxR=i;
					minR=i;
					maxC=j;
					minC=j;
					getChain (arr,team,i,j);
					getCenter(minArea);
				}
				noOfOcc=0;
			}
		}
	}
	
	public Point[] findPlayers(String[] photo, int team, int threshold) {
		
		if(photo.length > 0) // check for empty image
		{		char [][] arr =new char [photo.length][photo[0].length()];
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[0].length;j++)
				arr[i][j]=photo[i].charAt(j);
		int minArea = threshold%4 ==0 ? threshold/4 : (threshold/4) +1 ;
		for(int i=0 ;i<1000;i++)
			temp[i]=new Point();
		getOcc(arr,team,minArea) ;
		}
		Point[] res = new Point[index];
		sort(temp);
		for(int i=0;i<res.length;i++)
			{
				res[i]=new Point(temp[i]);
			}
		
		if(index==0)
			return null;
		else
			return res ;
	}

}
