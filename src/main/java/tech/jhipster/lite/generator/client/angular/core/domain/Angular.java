package tech.jhipster.lite.generator.client.angular.core.domain;

import java.util.List;
import java.util.Map;

public class Angular {

  private Angular() {}

  public static List<String> devDependencies() {
    return List.of(
      "@angular-builders/jest",
      "@angular-devkit/build-angular",
      "@angular/cli",
      "@angular/compiler-cli",
      "@types/node",
      "@types/jest",
      "jest",
      "ts-jest",
      "jest-preset-angular",
      "jest-sonar-reporter",
      "typescript"
    );
  }

  public static List<String> dependencies() {
    return List.of(
      "@angular/animations",
      "@angular/common",
      "@angular/compiler",
      "@angular/core",
      "@angular/forms",
      "@angular/platform-browser",
      "@angular/platform-browser-dynamic",
      "@angular/router",
      "rxjs",
      "tslib",
      "zone.js"
    );
  }

  public static Map<String, String> scripts() {
    // @formatter:off
    return Map.of(
      "ng", "ng",
      "start", "ng serve",
      "build", "ng build --output-path=target/classes/static",
      "watch", "ng build --watch --configuration development",
      "test", "ng test --coverage"
    );
    // @formatter:on
  }

  public static List<String> files() {
    return List.of("angular.json", "jest.conf.js", "tsconfig.app.json", "tsconfig.json", "tsconfig.spec.json");
  }

  public static Map<String, String> angularFiles() {
    // @formatter:off
    return Map.ofEntries(
      Map.entry("index.html", ""),
      Map.entry("main.ts", ""),
      Map.entry("polyfills.ts", ""),
      Map.entry("styles.css", ""),
      Map.entry("app.module.ts", "app/common/primary/app"),
      Map.entry("app.component.ts", "app/common/primary/app"),
      Map.entry("app.component.css", "app/common/primary/app"),
      Map.entry("app.component.html", "app/common/primary/app"),
      Map.entry("app-routing.module.ts", "app/common/primary/app"),
      Map.entry("app.component.spec.ts", "app/common/primary/app"),
      Map.entry("environment.prod.ts", "environments"),
      Map.entry("environment.ts", "environments")
    );
    // @formatter:on
  }
}
