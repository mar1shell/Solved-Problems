class Solution {
    public String simplifyPath(String path) {
        StringBuilder currDirectory = new StringBuilder(), answer = new StringBuilder();
        ArrayList<String> directories = new ArrayList<>();

        for (char currChar: path.toCharArray()) {
            if (currChar == '/') {
                if (currDirectory.length() == 1 && currDirectory.charAt(0) == '.') {
                    currDirectory.setLength(0);

                    continue;
                }

                if (currDirectory.length() == 2 && currDirectory.toString().equals("..")) {
                    if (!directories.isEmpty()) {
                        directories.remove(directories.size() - 1);
                    }

                    currDirectory.setLength(0);

                    continue;
                }

                if (!currDirectory.isEmpty()) {
                    directories.add(currDirectory.toString());
                    currDirectory.setLength(0);
                }
            } else {
                currDirectory.append(currChar);
            }
        }

        if (currDirectory.length() == 2 && currDirectory.toString().equals("..")) {
            if (!directories.isEmpty()) {
                directories.remove(directories.size() - 1);
            }
        } else if (currDirectory.length() == 1 && currDirectory.charAt(0) == '.') {
            currDirectory.setLength(0);
        } else if (!currDirectory.isEmpty()) { 
            directories.add(currDirectory.toString());
        }

        if (directories.isEmpty()) {
            answer.append('/');
        }

        for (String directory: directories) {
            answer.append('/');
            answer.append(directory);
        }

        return answer.toString();
    }
}