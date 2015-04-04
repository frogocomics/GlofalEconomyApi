/*
 * Copyright 2015-2015 Nikos Grammatikos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.nikosgram.glofal.economy.api.configuration;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ConfigurationDriver< T >
{
    protected final Class< T >         configuration;
    protected final Path               workDirectory;
    protected final StorageDriver< T > driver;

    protected T model = null;

    public ConfigurationDriver( Class< T > configuration )
    {
        this( configuration, Paths.get( "." ) );
    }

    public ConfigurationDriver( Class< T > configuration, Path workDirectory )
    {
        if ( !configuration.isAnnotationPresent( Configuration.class ) )
        {
            throw new RuntimeException( "This class is not Configuration!" );
        }
        this.configuration = configuration;
        this.workDirectory = workDirectory;
        this.driver = new StorageDriver< T >( this );
    }

    public T getModel()
    {
        return model;
    }

    public StorageDriver< T > getDriver()
    {
        return driver;
    }

    public ConfigurationDriver< T > save()
    {
        driver.save();
        return this;
    }

    public ConfigurationDriver< T > load()
    {
        driver.load();
        return this;
    }
}