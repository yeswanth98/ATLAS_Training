#include <iostream> // Include the input/output stream library

int main() {
    // 1. Declare and initialize an integer variable
    int myVariable = 25; 

    // 2. Declare a pointer to an integer
    // The asterisk (*) indicates that 'ptr' is a pointer
    int* ptr; 

    // 3. Assign the address of 'myVariable' to 'ptr'
    // The ampersand (&) is the "address-of" operator
    ptr = &myVariable; 

    // 4. Print the value of 'myVariable' directly
    std::cout << "Value of myVariable: " << myVariable << std::endl;

    // 5. Print the memory address stored in 'ptr'
    std::cout << "Address stored in ptr (address of myVariable): " << ptr << std::endl;

    // 6. Print the value pointed to by 'ptr'
    // The asterisk (*) here is the "dereference" operator,
    // which accesses the value at the address the pointer holds
    std::cout << "Value pointed to by ptr: " << *ptr << std::endl;

    // 7. Modify the value of 'myVariable' through the pointer
    *ptr = 50; 

    // 8. Print the new value of 'myVariable' to show the change
    std::cout << "New value of myVariable after modification through pointer: " << myVariable << std::endl;

    return 0; // Indicate successful program execution
}