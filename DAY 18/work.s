	.file	"work.c"
	.text
	.section .rdata,"dr"
.LC0:
	.ascii "b :  %u  %u  %u  \12\0"
	.text
	.globl	b
	.def	b;	.scl	2;	.type	32;	.endef
	.seh_proc	b
b:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movl	$10, -4(%rbp)
	movl	$20, -8(%rbp)
	movl	$30, -12(%rbp)
	leaq	-12(%rbp), %r8
	leaq	-8(%rbp), %rdx
	leaq	-4(%rbp), %rax
	leaq	.LC0(%rip), %rcx
	movq	%r8, %r9
	movq	%rdx, %r8
	movq	%rax, %rdx
	call	printf
	nop
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section .rdata,"dr"
.LC1:
	.ascii "a :  %u  %u  %u  \12\0"
	.text
	.globl	a
	.def	a;	.scl	2;	.type	32;	.endef
	.seh_proc	a
a:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	movl	$10, -4(%rbp)
	movl	$20, -8(%rbp)
	movl	$30, -12(%rbp)
	leaq	-12(%rbp), %r8
	leaq	-8(%rbp), %rdx
	leaq	-4(%rbp), %rax
	leaq	.LC1(%rip), %rcx
	movq	%r8, %r9
	movq	%rdx, %r8
	movq	%rax, %rdx
	call	printf
	call	b
	nop
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.section .rdata,"dr"
.LC2:
	.ascii "main :  %u  %u  %u  \12\0"
.LC3:
	.ascii "%u  %u\12\0"
.LC4:
	.ascii "%u \12\0"
	.align 8
.LC5:
	.ascii "main add : %u    prinnt add : %u    a add : %u    b add : %u\0"
	.text
	.globl	main
	.def	main;	.scl	2;	.type	32;	.endef
	.seh_proc	main
main:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$80, %rsp
	.seh_stackalloc	80
	.seh_endprologue
	movl	%ecx, 16(%rbp)
	movq	%rdx, 24(%rbp)
	call	__main
	movl	$10, -16(%rbp)
	movl	$20, -20(%rbp)
	movl	$30, -24(%rbp)
	leaq	-24(%rbp), %r8
	leaq	-20(%rbp), %rdx
	leaq	-16(%rbp), %rax
	leaq	.LC2(%rip), %rcx
	movq	%r8, %r9
	movq	%rdx, %r8
	movq	%rax, %rdx
	call	printf
	call	a
	movq	$0, -8(%rbp)
	movl	$0, -12(%rbp)
	jmp	.L4
.L5:
	movl	-12(%rbp), %eax
	cltq
	leaq	0(,%rax,8), %rdx
	movq	24(%rbp), %rax
	addq	%rdx, %rax
	movq	(%rax), %rax
	subq	-8(%rbp), %rax
	movq	%rax, %rdx
	movl	-12(%rbp), %eax
	cltq
	leaq	0(,%rax,8), %rcx
	movq	24(%rbp), %rax
	addq	%rcx, %rax
	movq	(%rax), %rax
	leaq	.LC3(%rip), %rcx
	movq	%rdx, %r8
	movq	%rax, %rdx
	call	printf
	movl	-12(%rbp), %eax
	cltq
	leaq	0(,%rax,8), %rdx
	movq	24(%rbp), %rax
	addq	%rdx, %rax
	movq	(%rax), %rax
	movq	%rax, -8(%rbp)
	addl	$1, -12(%rbp)
.L4:
	movl	-12(%rbp), %eax
	cmpl	16(%rbp), %eax
	jl	.L5
	movq	24(%rbp), %rax
	movq	(%rax), %rax
	leaq	.LC4(%rip), %rcx
	movq	%rax, %rdx
	call	printf
	movl	$10, %ecx
	call	putchar
	leaq	a(%rip), %r9
	movq	.refptr.printf(%rip), %r8
	leaq	main(%rip), %rdx
	leaq	.LC5(%rip), %rax
	leaq	b(%rip), %rcx
	movq	%rcx, 32(%rsp)
	movq	%rax, %rcx
	call	printf
	movl	$0, %eax
	addq	$80, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.def	__main;	.scl	2;	.type	32;	.endef
	.ident	"GCC: (Rev4, Built by MSYS2 project) 15.1.0"
	.def	printf;	.scl	2;	.type	32;	.endef
	.def	putchar;	.scl	2;	.type	32;	.endef
	.section	.rdata$.refptr.printf, "dr"
	.p2align	3, 0
	.globl	.refptr.printf
	.linkonce	discard
.refptr.printf:
	.quad	printf
