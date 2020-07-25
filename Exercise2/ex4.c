#include "mpi.h"
#include <stdio.h>
int main(int argc,char *argv[])
{
 int rank; /* process rank */
 int size,i,j; /* Number of processes */
 int msgtag =123;
 MPI_Init(&argc, &argv);
 MPI_Comm_size( MPI_COMM_WORLD, &size );
 MPI_Comm_rank( MPI_COMM_WORLD, &rank );
 MPI_Status status;
 if(rank ==0){
  int A[8][8];
  for(i=0;i<8;i++)
   for(j=0;j<8;j++)
    A[i][j]=i+j;
  for(i=1;i<9;i++)
   MPI_Send(&A[i-1],8,MPI_INT,i,msgtag,MPI_COMM_WORLD);
  int sum=0,temp;
  for(i=1;i<9;i++){
   MPI_Recv(&temp,1,MPI_INT,i,msgtag,MPI_COMM_WORLD,&status);
   sum+=temp;
  }
  printf("%d\n",sum);
 }
 if(rank !=0)
 {
  int k[8];
  MPI_Recv(&k,8,MPI_INT,0,msgtag,MPI_COMM_WORLD,&status);
  int sum=0;
  for(i=0;i<8;i++)
  {
   sum+=k[i];
  }
  MPI_Send(&sum,1,MPI_INT,0,msgtag,MPI_COMM_WORLD);
 }
 MPI_Finalize();
}