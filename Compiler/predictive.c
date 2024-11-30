#include <stdio.h>
#include <ctype.h>
#include <string.h>

#define ID 0
#define CONST 1
#define MULOP 2
#define ADDOP 3
#define OP 4
#define CP 5
#define ERR 6
#define COL 7
#define SIZE 50

int token;
char lexbuff[SIZE];
int lookahead = 0;

int E();
int T();
int EPRIME();
int TPRIME();
int F();
int lexer();

int main() {
    printf("Enter the string: ");
    fgets(lexbuff, SIZE, stdin);
    lexbuff[strcspn(lexbuff, "\n")] = 0;  // Remove newline character if present

    if (E()) {
        printf("Valid string\n");
    } else {
        printf("Invalid string\n");
    }
    
    return 0;
}

int E() {
    if (T()) {
        if (EPRIME()) {
            return 1;
        } else {
            return 0;
        }
    } else {
        return 0;
    }
}

int T() {
    if (F()) {
        if (TPRIME()) {
            return 1;
        } else {
            return 0;
        }
    } else {
        return 0;
    }
}

int EPRIME() {
    token = lexer();
    if (token == ADDOP) {
        lookahead++;
        if (T()) {
            if (EPRIME()) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    } else {
        return 1;
    }
}

int TPRIME() {
    token = lexer();
    if (token == MULOP) {
        lookahead++;
        if (F()) {
            if (TPRIME()) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    } else {
        return 1;
    }
}

int F() {
    token = lexer();
    if (token == ID) {
        return 1;
    } else if (token == OP) {
        if (E()) {
            token = lexer();
            if (token == CP) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    } else {
        return 0;
    }
}

int lexer() {
    if (lexbuff[lookahead] != '\0') {
        while (lexbuff[lookahead] == '\t' || lexbuff[lookahead] == ' ') {
            lookahead++;
        }
        if (isalpha(lexbuff[lookahead])) {
            while (isalpha(lexbuff[lookahead])) lookahead++;
            return ID;
        } else if (isdigit(lexbuff[lookahead])) {
            while (isdigit(lexbuff[lookahead])) lookahead++;
            return CONST;
        } else if (lexbuff[lookahead] == '+') {
            lookahead++;
            return ADDOP;
        } else if (lexbuff[lookahead] == '*') {
            lookahead++;
            return MULOP;
        } else if (lexbuff[lookahead] == '(') {
            lookahead++;
            return OP;
        } else if (lexbuff[lookahead] == ')') {
            lookahead++;
            return CP;
        } else {
            return ERR;
        }
    }
    return COL;
}
