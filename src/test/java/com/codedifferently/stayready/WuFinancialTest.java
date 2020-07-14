package com.codedifferently.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WuFinancialTest {

  WuFinancial wF;

  @Before
  public void setup() {

    this.wF = new WuFinancial();
    // wF.initRateMap();
  }

  @Test
  public void USDtoEURTest() {
    // Given
    double curr = 1.00;
    double expected = 0.88;
    // When
    double actual = wF.USDtoEUR(curr);
    // Then
    Assert.assertEquals(expected, actual, 0.0);
  }

  @Test
  public void EURtoUSDTest() {
    // Given
    double curr = 1.00;
    double expected = 1.13;
    // When
    double actual = wF.EURtoUSD(curr);
    // Then
    Assert.assertEquals(expected, actual, 0.00);
  }

  @Test
  public void EURtoGBPTest() {
    // Given
    double curr = 1.00;
    double expected = 0.89;
    // When
    double actual = wF.EURtoGBP(curr);
    // Then
    Assert.assertEquals(expected, actual, 0.00);
  }

  @Test
  public void GBPtoINRTest() {
    // Given
    double curr = 1.00;
    double expected = 95.02;
    // When
    double actual = wF.GBPtoINR(curr);
    // Then
    Assert.assertEquals(expected, actual, 0.0);
  }

  @Test
  public void INRtoCADTest() {
    // Given
    double curr = 1.00;
    double expected = 0.018;
    // When
    double actual = wF.INRtoCAD(curr);
    // Then
    Assert.assertEquals(expected, actual, 0.0);
  }

  @Test
  public void CADtoSGDTest() {
    // Given
    double curr = 1.00;
    double expected = 1.02;
    // When
    double actual = wF.CADtoSGD(curr);
    // Then
    Assert.assertEquals(expected, actual, 0.0);
  }

  @Test
  public void SGDtoCHFTest() {
    // Given
    double curr = 1.00;
    double expected = 0.68;
    // When
    double actual = wF.SGDtoCHF(curr);
    // Then
    Assert.assertEquals(expected, actual, 0.0);
  }

  @Test
  public void CHFtoMYRTest() {
    // Given
    double curr = 1.00;
    double expected = 4.53;
    // When
    double actual = wF.CHFtoMYR(curr);
    // Then
    Assert.assertEquals(expected, actual, 0.0);
  }

  @Test
  public void MYRtoJPYTest() {
    // Given
    double curr = 1.00;
    double expected = 25.06;
    // When
    double actual = wF.MYRtoJPY(curr);
    // Then
    Assert.assertEquals(expected, actual, 0.0);
  }

  @Test
  public void JPYtoCNYTest() {
    // Given
    double curr = 1.00;
    double expected = 0.065;
    // When
    double actual = wF.JPYtoCNY(curr);
    // Then
    Assert.assertEquals(expected, actual, 0.0);
  }

}
