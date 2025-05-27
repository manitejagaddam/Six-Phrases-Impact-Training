#include <stdio.h>
#include <string.h>




void b(){
    int n1 = 10, n2 = 20, n3 = 30;
    printf("b :  %u  %u  %u  \n", &n1, &n2, &n3);

}

void a(){
    int n1 = 10, n2 = 20, n3 = 30;
    printf("a :  %u  %u  %u  \n", &n1, &n2, &n3);
    b();
    
}


int main(int argc, char *argv[]){
    int n1 = 10, n2 = 20, n3 = 30;
    printf("main :  %u  %u  %u  \n", &n1, &n2, &n3);

    a();
    void * prevAdd = 0;
    for(int i = 0 ;i < argc ; i++){
        // printf(" main para %d -> %u     ", i, argv[i]);

        // printf("main para %d -> Address: %u  String: %s, diff : %i \n", i, (void*)argv[i], argv[i], (void*)argv[i] - prevAdd);
        printf("%u  %u\n", (void*)argv[i], (void*)argv[i] - prevAdd);
        prevAdd = (void*)argv[i];

    }

    printf("%u \n", *argv);
    printf("\n");


    printf("main add : %u    prinnt add : %u    a add : %u    b add : %u", &main, &printf, &a, &b);

    return 0;
}

