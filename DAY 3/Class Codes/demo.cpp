#include<iostream>
#include<math.h>
#include<stdio.h>
int main()
{
int n;
    printf("Enter the number :");
    scanf("%d", &n);


    // Approach - 01
    //
    int len = log10(n) + 1;
    int sum = 0;
    int power = 1;

    while (len > 0) {
        int copy = n;
        printf("copy = %d\n", copy);
      //  cout << power << " -> ";
      printf("%d -> ", power);
        if (power == 1) {
            while (copy > 0) {
                //cout << copy % 10 << " ";
                printf("%d ", copy % 10);
                sum += copy % 10;
                copy /= 10;
            }
            printf("\n");
            //cout << endl;
        }
        else {
            while (copy >= pow(10, power - 1)) {
    //            cout << copy % int(pow(10, power)) << " ";
               printf("%d %d %d %d ",power, (int)(pow(10,power)), copy % (int(pow(10, power))), int(pow(10, power)));
                //printf("%d %d ", copy % (int(pow(10, power))), int(pow(10, power)));
                sum += copy % int(pow(10, power));
                copy /= 10;
            }
            //cout << endl;
            printf("\n");
        }
        power++;
        len--;
    }

//    cout << sum;
      printf("\nSum = %d", sum);
}
