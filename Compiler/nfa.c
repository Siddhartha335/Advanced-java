#include <stdio.h> 

#include <stdbool.h> 

#include <string.h> 

#include <ctype.h> 

 

// Enumeration for different token types 

typedef enum { 

    IDENTIFIER, 

    CONSTANT, 

    OPERATOR 

} TokenType; 

 

// Function to check if a character is a letter 

bool isLetter(char ch) { 

    return isalpha(ch) || ch == '_'; 

} 

 

// Function to check if a character is a digit 

bool isDigit(char ch) { 

    return isdigit(ch); 

} 

 

// Function to recognize identifiers using NFA 

bool recognizeIdentifier(const char *input) { 

    enum State { START, ACCEPT, REJECT }; 

    enum State state = START; 

    int i = 0; 

    while (input[i] != '\0') { 

        switch (state) { 

            case START: 

                if (isLetter(input[i])) 

                    state = ACCEPT; 

                else 

                    state = REJECT; 

                break; 

            case ACCEPT: 

                if (!(isLetter(input[i]) || isDigit(input[i]))) 

                    state = REJECT; 

                break; 

            case REJECT: 

                return false; 

        } 

        i++; 

    } 

    return state == ACCEPT; 

} 

 

// Function to recognize constants using NFA 

bool recognizeConstant(const char *input) { 

    enum State { START, ACCEPT, REJECT }; 

    enum State state = START; 

 

    int i = 0; 

    while (input[i] != '\0') { 

        switch (state) { 

 

            case START: 

                if (isDigit(input[i])) 

                    state = ACCEPT; 

                else 

                    state = REJECT; 

                break; 

 

            case ACCEPT: 

                if (!isDigit(input[i])) 

                    state = REJECT; 

                break; 

 

            case REJECT: 

                return false; 

        } 

        i++; 

    } 

    return state == ACCEPT; 

} 

 

// Function to recognize operators using NFA 

bool recognizeOperator(const char *input) { 

    // Since operators consist of single characters, no need for NFA 

    return strlen(input) == 1 && strchr("+-*/=%", input[0]) != NULL; 

} 

 

 

 

int main() { 

    char input[100]; 

        printf(" Enter the Identifier input: "); 

        scanf("%s", input); 

 

        if (recognizeIdentifier(input)) 

            printf("Output: Yes\n"); 

 

        else 

            printf("Output: No\n"); 

 

        printf(" Enter a Constant input: "); 

        scanf("%s", input); 

 

        if (recognizeConstant(input)) 

            printf("Output: Yes\n"); 

 

        else 

            printf("Output: No\n"); 

 

        printf(" Enter an Operator input: "); 

        scanf("%s", input); 

 

        if (recognizeOperator(input)) 

            printf("Output: Yes\n"); 

 

        else 

            printf("Output: No\n"); 

    return 0; 

 

} 