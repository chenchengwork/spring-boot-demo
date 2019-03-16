## JAVA 基础知识
### 源文件声明规则
```
1. 一个源文件中只能有一个public类
2. 一个源文件可以有多个非public类
3. 源文件的名称应该和public类的类名保持一致。例如：源文件中public类的类名是Employee，那么源文件应该命名为Employee.java。
4. 如果一个类定义在某个包中，那么package语句应该在源文件的首行
5. 如果源文件包含import语句，那么应该放在package语句和类定义之间， 如果没有package语句，那么import语句应该在源文件中最前面
```

### java 基本数据类型
```
1. 内置数据类型
byte, short, int, long, float, double, boolean, char

2. 引用类型
在Java中，引用类型的变量非常类似于C/C++的指针。引用类型指向一个对象，指向对象的变量是引用变量。这些变量在声明时被指定为一个特定的类型，比如 Employee、Puppy 等。变量一旦声明后，类型就不能被改变了
(1). 对象、数组都是引用数据类型
(2). 所有引用类型的默认值都是null
(3). 一个引用变量可以用来引用任何与之兼容的类型

例子：Site site = new Site("Runoob")

3. 常量
常量在程序运行时是不能被修改的。
在 Java 中使用 final 关键字来修饰常量，声明方式和变量类似：

final double PI = 3.1415927;

虽然常量名也可以用小写，但为了便于识别，通常使用大写字母表示常量。

4. 自动类型转换
低  ------------------------------------>  高

byte,short,char—> int —> long—> float —> double 
```