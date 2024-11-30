#include <stdio.h> 

int main() { 

    FILE *file; 

    char filename[100]="yolo.txt"; 

    char ch; 

    int char_count = 0, word_count = 0, line_count = 0, in_word = 0; 

 

    // Input file name 

    printf("Enter the file name: "); 

    scanf("%s", filename); 

 

    // Open file 

    file = fopen("yolo.txt", "r"); 

 

    // Check if file exists 

    if (file == NULL) { 

        printf("File not found or unable to open.\n"); 

        return 1; 

    } 

 

    // Read file character by character 

    while ((ch = fgetc(file)) != EOF) { 

        // Increment character count 

        char_count++; 

 

        // Check for newline character 

        if (ch == '\n') 

            line_count++; 

 

        // Check for space, newline, or tab to detect end of word 

        if (ch == ' ' || ch == '\n' || ch == '\t') 

            in_word = 0; 

        // If not in word and non-space character encountered, increment word count 

        else if (in_word == 0) { 

            in_word = 1; 

            word_count++; 

        } 

    } 

 

    // Close file 

    fclose(file); 

 

    // Output results 

    printf("Number of characters: %d\n", char_count); 

    printf("Number of words: %d\n", word_count); 

    printf("Number of lines: %d\n", line_count); 

 

    return 0; 

} 