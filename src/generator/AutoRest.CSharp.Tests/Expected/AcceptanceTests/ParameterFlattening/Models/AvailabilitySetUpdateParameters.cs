// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsParameterFlattening.Models
{
    using System.Linq;

    public partial class AvailabilitySetUpdateParameters
    {
        /// <summary>
        /// Initializes a new instance of the AvailabilitySetUpdateParameters
        /// class.
        /// </summary>
        public AvailabilitySetUpdateParameters() { }

        /// <summary>
        /// Initializes a new instance of the AvailabilitySetUpdateParameters
        /// class.
        /// </summary>
        /// <param name="tags">A set of tags.</param>
        public AvailabilitySetUpdateParameters(System.Collections.Generic.IDictionary<string, string> tags)
        {
            Tags = tags;
        }

        /// <summary>
        /// Gets or sets a set of tags.
        /// </summary>
        /// <remarks>
        /// A description about the set of tags.
        /// </remarks>
        [Newtonsoft.Json.JsonProperty(PropertyName = "tags")]
        public System.Collections.Generic.IDictionary<string, string> Tags { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="Microsoft.Rest.ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (Tags == null)
            {
                throw new Microsoft.Rest.ValidationException(Microsoft.Rest.ValidationRules.CannotBeNull, "Tags");
            }
        }
    }
}
