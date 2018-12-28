package annotationtest

class MyBeanFactory {
    InterfacedBean newInterfaced() {
        new InterfacedBean()
    }

    AnnotatedBean newAnnotated() {
        new AnnotatedBean()
    }
}
