class Token:
    [NUM, ID, ADDOP, MULOP, SPECIAL] = range(5)
    EOF = -1

    def __init__(self, v, t):
        self.val = v
        self.type = t

    def __str__(self):
        return self.val

    def __eq__(self, obj):
        if isinstance(obj, str):
            return str(self) == obj
        if self.type == Token.SPECIAL:
            return self.val == obj.val
        return self.type == obj.type 
    
    def __ne__(self, obj):
        return not self == obj
