class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.length() != t.length()) {
            return false;
        }
        unordered_map<char, int> freq;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            freq[s[i]]++;
        }
        for (int i = 0; i < n; i++) {
            freq[t[i]]--;
        }

        for (int i = 0; i < n; i++) {
            if (freq[s[i]] != 0) {
                return false;
            }
        }
        return true;
    }
};
