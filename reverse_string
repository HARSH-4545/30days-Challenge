#include <stdio.h>
#include <string.h>

void reverse(char* str, int len, int i, int temp)
{
	if (i < len) {
		temp = str[i];
		str[i] = str[len - 1];
		str[len - 1] = temp;
		i++;
		len--;
		reverse(str, len, i, temp);
	}
}

int main()
{
	char str[100] = "string";
	printf("Original String: %s\n", str);

	int len = strlen(str);
	reverse(str, len, 0, 0);

	printf("Reversed String: %s", str);
	return 0;
}
