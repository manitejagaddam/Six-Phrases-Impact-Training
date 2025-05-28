#include <bits/stdc++.h>
using namespace std;

using namespace std::chrono;












char getCharInString(string & s, int k){
    int idx = 0;
    int n = s.size();
    while(idx < n){
        char ch;
        if(s[idx] >='a'){
            ch = s[idx];
            int val = 0;
            idx++;
            while(s[idx] <= '9' && s[idx] >= '0'){
                val = val * 10 + s[idx] - '0';
                idx++;
            }
            k -= val;
            if(k <= 0) return ch;
        }
        while(s[idx] <= '9'&& s[idx] >= '0') idx++;
    }
    return ' ';
}


int main(){
    string s;
    cin >> s;
    
    int k;
    cin >> k;

    cout << getCharInString(s, k) << endl;

    return 0;
}


