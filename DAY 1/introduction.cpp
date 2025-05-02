#include <iostream>
using namespace std;

class Day1{
    public:
        int add(int num1, int num2){
            return num1 + num2;
        }

        void printString(string s){
            cout << s << endl;
        }
};


int main(){
    Day1 obj;
    int num1 = 10;
    int num2 = 20;
    int ans = obj.add(num1, num2);
    cout << "Sum of " << num1 << " and " << num2 << " is " << ans << endl;
    string s = "let's learn 'CPP' together with MySlate Team";
    obj.printString(s);
    string s2 = "Success is when your \"signature\" becomes \"autograph\"";
    obj.printString(s2);
    string s3 = "\\n";
    obj.printString(s3);
    string s4 = "%%";
    obj.printString(s4);
    return 0;
}

