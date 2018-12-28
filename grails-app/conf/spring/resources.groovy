import annotationtest.AllMyBFPP
import annotationtest.MyBeanFactory

// Place your Spring DSL code here
beans = {
    myBeansFactory(MyBeanFactory)
    annotatedBean(myBeansFactory: "newAnnotated")
    interfacedBean(myBeansFactory: "newInterfaced")
    allMyBFPP(AllMyBFPP)
}
