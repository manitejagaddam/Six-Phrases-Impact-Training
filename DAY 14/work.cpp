#include <bits/stdc++.h>
using namespace std;




void convertSwap(string s) {
    int n = s.length();
    // if(n % 2) n--;
    for (int i = 1; i < n; i++) {
        swap(s[i], s[i - 1]);
        i++;
    }
    cout << s << endl;
}


void sumStr(string s1, string s2) {
    string ans = "";
    int m = s1.length() - 1;
    int n = s2.length() - 1;
    int carry = 0;
    while (n != -1 && m != -1) {
        int sum = 0;
        sum += s1[m] - '0';
        sum += s2[n] - '0';
        sum += carry;
        cout << "Sum : " << sum << "  Carry : " << carry << endl;
        carry = sum / 10;
        sum = sum % 10;
        ans += sum + '0';
        n--;
        m--;
    }

    while (n >= 0) {
        if (carry) {
            int temp = (s2[n--] - '0' + carry--);
            cout << "temp : " << temp << endl;
            carry = temp / 10;
            temp %= 10;
            ans += temp + '0';
        }
        else {
            ans += s2[n--];
        }

    }
    while (m >= 0) {
        if (carry) {
            int temp = (s1[m--] - '0' + carry--);
            cout << "temp : " << temp << endl;
            carry = temp / 10;
            temp %= 10;
            ans += temp + '0';
        }
        else {
            ans += s1[m--];
        }
    }
    if (carry) ans += '1';

    reverse(ans.begin(), ans.end());



    cout << ans << endl;
}



void sumPrefix(string s) {
    int sum = 0;
    int n = s.length();
    int idx = 0;
    int temp = 0;

    while (idx < n) {
        temp *= 10;
        temp += s[idx] - '0';
        sum += temp;
        idx++;
    }

    cout << sum << endl;
}



void Panagram(string s) {
    int n = s.length();
    if (n < 26) {
        cout << "Not an Panagram";
        return;
    }

    vector<int> check(26, 0);
    for (char i : s) {
        if (tolower(i) - 'a' > 26 || tolower(i) - 'a' < 0) {
            cout << "Not a Panagram";
            return;
        }
        check[tolower(i) - 'a']++;
    }

    for (int i : check) {
        cout << i << " ";
    }

    for (int i : check) {
        if (i == 0) {
            cout << "Not a Panagram";
            return;
        }
    }

    cout << "It is a Panagram";
    return;

}



void int_roman(int n) {
    string s = "";
    while (n > 0) {
        if (n / 1000 > 0) {
            s += 'M';
            n -= 1000;
        }
        else if (n == 999) {
            s += "IM";
            break;
        }
        else if (n / 500 > 0) {
            s += 'D';
            n -= 500;
        }
        else if (n == 499) {
            s += "ID";
            break;
        }
        else if (n / 100 > 0) {
            s += 'C';
            n -= 100;
        }
        else if (n == 99) {
            s += "IC";
            break;
        }
        else if (n / 50 > 0) {
            s += 'L';
            n -= 50;
        }
        else if (n == 49) {
            s += "IL";
            break;
        }
        else if (n / 10 > 0) {
            s += 'X';
            n -= 10;
        }
        else if (n == 9) {
            s += "IX";
            break;
        }
        else if (n / 5 > 0) {
            s += 'V';
            n -= 5;
        }
        else if (n == 4) {
            s += "IV";
            break;
        }
        else {
            s += 'I';
            n -= 1;
        }
    }

    // reverse(s.begin(), s.end());

    cout << s << endl;
}

bool isVowel(char i) {
    return i == 'a' || i == 'A' || i == 'e' || i == 'E' || i == 'i' || i == 'I' || i == 'o' || i == 'O' || i == 'u' || i == 'U';
}


void vowelCount(string s, int k) {
    int start = 0;
    int end = 0;
    // int vowel_count = 0;
    // char vowel = ' ';

    int n = s.length();
    int ans = 0;
    // for(char i : s){
    //     if(isVowel(i)){
    //         vowel = i;
    //         break;
    //     }
    // }
    // set<char> st;
    unordered_map<char, int> mpp;

    while (end < n) {
        if (isVowel(s[end])) {
            mpp[tolower(s[end])]++;
        }
        if (mpp.size() > k) {
            if (isVowel(tolower(s[start]))) {
                mpp[tolower(s[start])]--;
                if (mpp[tolower(s[start])] == 0) mpp.erase(tolower(s[start]));
            }
            start++;
        }
        for (int i = start; i <= end; i++) {
            cout << s[i];
        }cout << endl;
        ans = end - start + 1;

        end++;
    }

    cout << ans << endl;
}


void zigZagConvertion(string s, int no_rows) {
    int len = s.length();
    string ans = "";
    for (int i = 0; i < no_rows; i++) {
        for (int j = 0; j < len; j += 2 * no_rows) {
            if (j - i > 0) ans += s[j - i];
            if (j + i < len) ans += s[j + i];
        }
    }

    cout << ans << endl;
}


int main() {
    string s;
    cin >> s;
    // int n;
    // cin >> n;
    // convertSwap(s);
    // sumStr(s, s1);
    // sumPrefix(s);
    // Panagram(s);
    // int_roman(n);
    // vowelCount(s, 2);
    zigZagConvertion(s, 2);
    return 0;
}





