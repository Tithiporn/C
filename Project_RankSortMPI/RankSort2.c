#include <stdio.h>
#include <stdlib.h>
#include "mpi.h"
#define MAX 50

int main(int argc, char *argv[])
{
    int i,j,count;
    int list[MAX],rank_list[50] = {0},sort_list[50] = {0};

    int A[100], myid, numprocs, chunksize = 100/4;
    int input, local_A[chunksize], local_count = 0;

    MPI_Init(&argc, &argv);
    MPI_Comm_size(MPI_COMM_WORLD, &numprocs);
    MPI_Comm_rank(MPI_COMM_WORLD, &myid);

    //myid is main process
    if (myid==0)
    {
        printf("Enter the number of items : ");
        fflush(stdout);
        scanf("%d", &count);

        printf("\nEnter the list elements:\n");
        for(i=0; i<count; i++)
        {
            scanf("%d",&list[i]);
        }
    }

	MPI_Bcast(&input, 1, MPI_INT, 0, MPI_COMM_WORLD);
	MPI_Scatter(A, chunksize, MPI_INT, local_A, chunksize, MPI_INT, 0, MPI_COMM_WORLD);

	for(i=0; i<count; i++)
	{                               // ex. sort 13,51,7 ==>list[0]=13, list[1]=51, list[2]=7
		for(j=0; j<i; j++)          //13<51 ==> list[0] < list[1]=51
		{                           //rank of list[1] increase
			if(list[i] >= list[j])
			{
			    rank_list[i]++;
			}
			else
            {
                rank_list[j]++;
            }
		}
	}
	// i = 0   j == 0    list[0] >= list[0]
    // i = 1    j == 0

	printf("\nRank for each item in the unsorted list\n");
	printf("\n\tElement\tRank\n");
	for(i=0; i<count; i++)
    {
        printf("\t%d\t%d\n",list[i],rank_list[i]+1);
    }

	/*Sort the list according to the rank*/
	for(i=0; i<count; i++)
    {
        sort_list[rank_list[i]] = list[i];
    }

    printf("\nSorted listed according to the rank\n");
	for(i=0; i<count; i++)
    {
           printf("\t%d\t\n",sort_list[i]);
    }

	MPI_Finalize();
}


