#include <bits/stdc++.h>
using namespace std;

// int split(string s){
//     int count = 0;
//     int idx = 0;
//     int n = s.length();

//     while(s[idx] == ' ')idx++;
//     while(idx < n){
//         if(idx > 0 && s[idx] == ' ' && s[idx - 1] == ' '){
//             idx++;
//             continue;
//         }
//         if(s[idx] == ' ') count++;
//         idx++;
//     }
//     if(s[idx - 1] != ' ') count++;
//     return count;
// }
// int split(string s1, string s2,int c=0){
//     return 0+c;
// }

// int compare(string s1, string s2){
//     int n = s1.length();
//     if(s1.length() != s2.length()) return -1;
//     int count = 0;
//     for(int i = 0 ; i < n ; i++){
//         if(s1[i] == s2[i]) count++;
//     }
//     return count;
// }

// void reverse_words(string s){
//     string ans = "";
//     int idx = s.length() - 1;

//     while(idx > 0){
//         string temp = "";
//         while(s[idx] != ' ' && idx != 0){
//             temp = s[idx] + temp;
//             idx--;
//         }
//         if(idx == 0) temp = s[0] + temp;
//         cout << temp << " ";

//         ans += temp;
//         ans += ' ';
//         while(s[idx] == ' ') idx--;
//     }
//     cout << endl;
//     // return ans;
//     cout << "Reversed String : " << ans;

// }


// void reverse(string & s){
//     int start = 0;
//     int end = s.length() - 1;
//     while(start < end){
//         swap(s[start++], s[end--]);
//     }
// }



// void reverse_words(string s){
//     string ans = "";
//     int idx = s.length() - 1;

//     while(idx > 0){
//         string temp = "";
//         while(s[idx] != ' ' && idx != 0){
//             // temp = s[idx] + temp;
//             temp += s[idx];
//             idx--;
//         }
//         if(idx == 0) temp += s[0];
//         cout << temp << " ";
//         reverse(temp);

//         ans += temp;
//         ans += ' ';
//         while(s[idx] == ' ') idx--;
//     }
//     cout << endl;
//     // return ans;
//     cout << "Reversed String : " << ans;

// }



int main(){
    string s1, s2;
    getline(cin, s1);
    getline(cin, s2);
    
    // sort(s.begin(), s.end());
    // cout << s;

    // cout << compare(s1, s2);
    cout << split(s1);
    cout << split(s1, s2);
    

    // reverse_words(s);

    // int no_words = split(s);
    // cout << no_words;

}