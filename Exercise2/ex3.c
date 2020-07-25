#include<stdio.h>
#include<string.h>
#include <mpi.h>

int main (int argc, char *argv[]) {

	int rank, size;
	int msgtag;
	int x[10],i;
	MPI_Status status;

	MPI_Init (&argc, &argv);
	MPI_Comm_size (MPI_COMM_WORLD, &size);
	MPI_Comm_rank (MPI_COMM_WORLD, &rank);


	msgtag=1234;

	if (rank == 0) {
            for(i=0;i<10;i++)
		x[i]=2*i;

		MPI_Send (&x, 10, MPI_INT, 1, msgtag, MPI_COMM_WORLD);
        	MPI_Recv (&x, 10, MPI_INT, 1, msgtag, MPI_COMM_WORLD, &status);
                 for(i=0;i<10;i++)
			printf("processor: %d got %d\n",rank,x[i]);

}

if (rank == 1){

        	MPI_Recv (&x, 10, MPI_INT, 0, msgtag, MPI_COMM_WORLD, &status);
			for(i=0;i<10;i++)
                x[i]=x[i]*10;
		MPI_Send (&x, 10, MPI_INT, 0, msgtag, MPI_COMM_WORLD);
	}
	MPI_Finalize ();
}


