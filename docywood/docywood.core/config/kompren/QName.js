// Javascript code here.
// Use the variable 'obj' to format it as expected in the variable 'res'.
// For instance:
// res = "'" + obj.toString() + "'"
// Helper methods can be coded here as in any Javascript file.

function getQN(object) {
    var str = "";
    if (typeof object.getName === "function") {
        str = object.getName();
        if (typeof object.eContainer === "function" && object.eContainer() !== null) {
            str = getQN(object.eContainer()) + "." + str;
        }
    }
    return str;
}


if (typeof obj === "object") {
    res = getQN(obj);
} else {
    res = obj;
}

