#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
int main()
{
pid_t pid;
pid = fork();
if (pid == 0)
{
printf("\nI am child process, id=%d\n",getpid());
printf("\nPriority :%d,id=%d\n",nice (-7),getpid());
}
else
{
printf("\nI am parent process, id=%d\n",getpid());
nice(1);
printf("\nPriority :%d,id=%d\n",nice (15),getpid());
}
return 0;
}