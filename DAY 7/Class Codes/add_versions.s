	.file	"add_versions.c"
	.text
	.globl	_add2
	.def	_add2;	.scl	2;	.type	32;	.endef
_add2:
	pushl	%ebp
	movl	%esp, %ebp
	subl	$16, %esp
	movl	12(%ebp), %eax
	movl	8(%ebp), %edx
	addl	%edx, %eax
	movl	%eax, -4(%ebp)
	movl	-4(%ebp), %eax
	leave
	ret
	.globl	_add3
	.def	_add3;	.scl	2;	.type	32;	.endef
_add3:
	pushl	%ebp
	movl	%esp, %ebp
	subl	$16, %esp
	movl	12(%ebp), %eax
	movl	8(%ebp), %edx
	addl	%eax, %edx
	movl	16(%ebp), %eax
	addl	%edx, %eax
	movl	%eax, -4(%ebp)
	movl	-4(%ebp), %eax
	leave
	ret
	.globl	_swapArr
	.def	_swapArr;	.scl	2;	.type	32;	.endef
_swapArr:
	pushl	%ebp
	movl	%esp, %ebp
	subl	$16, %esp
	movl	8(%ebp), %eax
	movl	(%eax), %eax
	movl	%eax, -4(%ebp)
	movl	12(%ebp), %eax
	movl	(%eax), %edx
	movl	8(%ebp), %eax
	movl	%edx, (%eax)
	movl	12(%ebp), %eax
	movl	-4(%ebp), %edx
	movl	%edx, (%eax)
	leave
	ret
	.globl	_swapPtr
	.def	_swapPtr;	.scl	2;	.type	32;	.endef
_swapPtr:
	pushl	%ebp
	movl	%esp, %ebp
	subl	$16, %esp
	movl	8(%ebp), %eax
	movl	(%eax), %eax
	movl	%eax, -4(%ebp)
	movl	12(%ebp), %eax
	movl	(%eax), %edx
	movl	8(%ebp), %eax
	movl	%edx, (%eax)
	movl	12(%ebp), %eax
	movl	-4(%ebp), %edx
	movl	%edx, (%eax)
	leave
	ret
	.def	___main;	.scl	2;	.type	32;	.endef
	.section .rdata,"dr"
LC0:
	.ascii " sum of 10 and 20 = %d\12\0"
	.align 4
LC1:
	.ascii " sum of 100 and 200 and 300 = %d\12\0"
LC2:
	.ascii "b4 n1 = %d, n2 = %d\12\0"
LC3:
	.ascii "A1 n1 = %d, n2 = %d\12\0"
LC4:
	.ascii "A2 n1 = %d, n2 = %d\12\0"
	.text
	.globl	_main
	.def	_main;	.scl	2;	.type	32;	.endef
_main:
	pushl	%ebp
	movl	%esp, %ebp
	andl	$-16, %esp
	subl	$32, %esp
	call	___main
	movl	$20, 4(%esp)
	movl	$10, (%esp)
	call	_add2
	movl	%eax, 4(%esp)
	movl	$LC0, (%esp)
	call	_printf
	movl	$300, 8(%esp)
	movl	$200, 4(%esp)
	movl	$100, (%esp)
	call	_add3
	movl	%eax, 4(%esp)
	movl	$LC1, (%esp)
	call	_printf
	movl	$100, 28(%esp)
	movl	$200, 24(%esp)
	movl	24(%esp), %edx
	movl	28(%esp), %eax
	movl	%edx, 8(%esp)
	movl	%eax, 4(%esp)
	movl	$LC2, (%esp)
	call	_printf
	leal	24(%esp), %eax
	movl	%eax, 4(%esp)
	leal	28(%esp), %eax
	movl	%eax, (%esp)
	call	_swapArr
	movl	24(%esp), %edx
	movl	28(%esp), %eax
	movl	%edx, 8(%esp)
	movl	%eax, 4(%esp)
	movl	$LC3, (%esp)
	call	_printf
	leal	24(%esp), %eax
	movl	%eax, 4(%esp)
	leal	28(%esp), %eax
	movl	%eax, (%esp)
	call	_swapPtr
	movl	24(%esp), %edx
	movl	28(%esp), %eax
	movl	%edx, 8(%esp)
	movl	%eax, 4(%esp)
	movl	$LC4, (%esp)
	call	_printf
	leave
	ret
	.def	_printf;	.scl	2;	.type	32;	.endef
