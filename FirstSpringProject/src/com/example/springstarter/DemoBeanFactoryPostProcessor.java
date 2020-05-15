package com.example.springstarter;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DemoBeanFactoryPostProcessor implements BeanFactoryPostProcessor{
	
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		BeanDefinition definition = arg0.getBeanDefinition("restaurantBean");
		MutablePropertyValues propertyValues = definition.getPropertyValues();
		propertyValues.addPropertyValue("welcomeNote", "modified from bean factory");
	}

}
