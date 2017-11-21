package string;

/*Given an absolute path for a file (Unix-style), simplify it.

For example,
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"*/

import java.util.ArrayList;

public class SymplifyPath {
    public String simplifyPath(String path) {
        if(path == null || path.length() == 0){
            return path;
        }
        String[] p = path.split("/+");
        String res = "/";
        ArrayList<String> temp = new ArrayList<>();
        for(String s: p){
            if(s.equals("..")){
                if(temp.size() > 0){
                    temp.remove(temp.size() - 1);
                }
            }else if(!s.equals(".") && ! s.equals("")){
                temp.add(s);
            }
        }
        for(String s: temp){
            res += s + "/";

        }
        if(res.length() > 1){
            res = res.substring(0, res.length() - 1);
        }
        return res;
    }

}
